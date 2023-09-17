package com.example.proyecto.controllers;

import com.example.proyecto.models.bookingModel;
import com.example.proyecto.repositories.bookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class bookingControl {

    @Autowired
    private bookingRepository myBookings;

    @GetMapping
    public List<bookingModel> getBooking() {

        return myBookings.findAll();
    }

    @PostMapping(path="/add")
    public bookingModel saveBooking(@RequestBody bookingModel newBooking) {

        return myBookings.save(newBooking);
    }

    @GetMapping("/email/{email}")
    public bookingModel getBookingByEmail(@PathVariable String email) {
        return myBookings.findByEmail(email);
    }

    @PutMapping("/update/{email}")
    public ResponseEntity<?> updateBookingByEmail(@PathVariable String email, @RequestBody bookingModel updatedBooking) {
        bookingModel existingBooking = myBookings.findByEmail(email);

        if (existingBooking != null) {
            existingBooking.setName(updatedBooking.getName());
            existingBooking.setPhone(updatedBooking.getPhone());
            existingBooking.setEntryDate(updatedBooking.getEntryDate());
            existingBooking.setExitDate(updatedBooking.getExitDate());
            existingBooking.setComments(updatedBooking.getComments());

            try {
                myBookings.save(existingBooking);
                return ResponseEntity.ok(existingBooking);
            } catch (Exception e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar la reserva.");
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{email}")
    public ResponseEntity<?> deleteBookingByEmail(@PathVariable String email) {
        bookingModel existingBooking = myBookings.findByEmail(email);

        if (existingBooking != null) {
            try {
                myBookings.delete(existingBooking);
                return ResponseEntity.ok("Reserva eliminada exitosamente.");
            } catch (Exception e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al eliminar la reserva.");
            }
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}




