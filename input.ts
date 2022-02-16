
class factorial{
	
	constructor(){

	}

	calc(n: number){
		if( n == 1 )
			return 1;
		return n * this.calc(n-1);
	}
}

let F = new factorial();

(F.calc(10));
//Metodos estaticos