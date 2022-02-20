
function trunc(n: number){
	return n | 0;
};

class SegmentTree{
	n: number;
	T = new Array();

	constructor(n: number, A: object){
		this.n = n;
		this.T = new Array(4 * n + 5);

		this.build(1, n, 1, A);
	}

	private build(x: number, xend: number, nod: number, A: object){
		if( x == xend )
			return this.T[nod] = A[x];
		let mid = trunc((x + xend) / 2);

		return this.T[nod] = this.build(x, mid, nod*2, A) + this.build(mid+1, xend, nod*2+1, A);
	}

	public query(x: number, xend: number, nod: number, a: number, b: number){
		if( a<=x && xend<=b )
			return this.T[nod];
		if( b < x || xend < a )
			return 0;
		let mid = trunc((x + xend) / 2);

		return this.query(x, mid, nod*2, a, b) + this.query(mid+1, xend, nod*2+1, a, b);
	}
}

let n = 8;
let A = [0, 1, 2, 3, 4, 5, 6, 7, 8, 0];

let ST = new SegmentTree(n, A);

console.log(ST.query(1, n, 1, 5, 7));
