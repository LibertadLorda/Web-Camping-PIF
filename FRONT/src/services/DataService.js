import http from '../httpCommon';

export default({

    create(Data){
        return http.post(`/product`, ProductData);
    },

    getAll() {
        return http.get(`/camping`);
    },
      
    getById(productId) {
        return http.get(`/camping/${productId}`);
    },
    
    update(productId, ProductData) {
        return http.put(`/camping/update/${productId}`, ProductData);
    },
    
    delete(productId) {
        return http.delete(`/camping/delete/${productId}`);
    }
});
