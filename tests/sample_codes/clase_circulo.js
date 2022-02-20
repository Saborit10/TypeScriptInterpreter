
function pi(){
	return 3.14159;
}

class Circle{
	private radio: number; 
	public length: number;

	constructor(radio: number){
		this.radio = radio;
		this.length = 2 * pi() * this.radio;
	}

	protected getLength() {
		return this.length;
	}
	public getLength2(a: number, b: string) {
		return this.getLength();
	}
}

let circle = new Circle(5);

// (circle.length);

(circle.getLength2());