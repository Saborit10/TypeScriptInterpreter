
let fib = function(n: number){
	if( n == 1 || n == 0 )
		return 1;
	
	return fib(n-1) + fib(n-2);
}

let fib2 = function fib(n: number){
	if ( n < 5 )
		return 0;
	else	
		return 1;
}

let b = fib(6);

(b);