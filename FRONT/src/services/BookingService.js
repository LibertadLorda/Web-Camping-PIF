import http from '../httpCommon';

export default({

    post(Data){
        return http.post(`/booking/add`, Data);
    },

    getAll() {
        return http.get(`/booking` );
    },
      
    getById(email) {
        return http.get(`/booking/email/${email}`);
    },
    
    update(email, Data) {
        return http.put(`/booking/update/${email}`, Data);
    },

    delete(email,Data){
        return http.delete(`/booking/delete/${email}`, Data)
    }
    
});
