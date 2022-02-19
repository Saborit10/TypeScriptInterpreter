
let i = 1;

let A = ["", "luis", "carlos", "roberto", "noel", "jesus", "maria"];


while( i < A.length ){
	let j = 1;
	
	while( j <= 5 ){
		console.log(A[i] + " " + j);
		j += 1;
	}
	
	i += 1;
}
