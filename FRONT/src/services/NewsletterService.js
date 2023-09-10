import http from '../httpCommon';

export default({

    post(Data){
        return http.post(`/newsletter/add`, Data);
    },

    getAll() {
        return http.get(`/camping/newsletter` );
    },
      
    getById(productId) {
        return http.get(`/camping/${id}`);
    },

})