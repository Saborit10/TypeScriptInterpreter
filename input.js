// let obj = {
// 	a: 1,
// 	b: 2,
// 	3: 3
// }
// let arr = [1, 2, 3, 4];
// let variable = arr;
// for(let i in variable){
// 	console.log(i);
// }
// for(let i of variable){
// 	console.log(i);
// }
var A = /** @class */ (function () {
    function A() {
        this.p = 5;
    }
    A.prototype.getP = function () {
        return this.p;
    };
    return A;
}());
var a = new A();
console.log(a);
