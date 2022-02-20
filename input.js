var global = 0;
var A = /** @class */ (function () {
    function A(p, q) {
        this.p = 1;
        this.q = 0;
        this.p = p;
        this.q = q;
    }
    A.prototype.f = function (a) {
        return a == 2 ? 1 : ++global;
    };
    return A;
}());
var obj = new A(2, 3);
console.log(obj.f(2));
console.log(global);
//revisar los metodos declarados en literales
// Revisar las divisiones entre cero, como tratarlas
