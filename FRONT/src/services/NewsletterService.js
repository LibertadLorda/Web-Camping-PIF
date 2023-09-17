import http from '../httpCommon';

export default({

    post(Data){
        return http.post(`/newsletter/add`, Data);
    },

    getAll() {
        return http.get(`/newsletter` );
    },
      
    getById(id) {
        return http.get(`/newsletter/${id}`);
    },

})