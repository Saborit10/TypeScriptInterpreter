
let A = {
	a: 3,
	objecto: [1, 2],
	6: 4
};

A.a = 5;
A[6] = 10; 

let b: number = 6;

b = "dfd"; // error: b no debe poderse cambiar a un string

(A);
(b);