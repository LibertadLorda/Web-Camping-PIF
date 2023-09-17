import http from '../httpCommon';

export default({

    create(Data){
        return http.post(`/product`, Data);
    },

    getAll() {
        return http.get(`/camping` );
    },
      
    getById(productId) {
        return http.get(`/camping/${productId}`);
    },
    
    update(productId, ProductData) {
        return http.put(`/camping/update/${productId}`, ProductData);
    },
    
});
