const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanshiwuzhaoling/",
            name: "xiaoyuanshiwuzhaoling",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanshiwuzhaoling/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园失物招领小程序"
        } 
    }
}
export default base
