
function fib(n: number){
	if( n == 1 || n == 0 )
		return 1;
	
	return fib(n-1) + fib(n-2);
}

let b = fib(6);

(b);