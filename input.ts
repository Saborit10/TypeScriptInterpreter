
let a = {
	r: 0,
	p: 6,
	obj: {
		fr: 1,
		sc: 2
	}
};

// a.p = 5;
// a.obj.sc = 10;
// a["obj"].fr = 6;
// a[3] = 6; // NO HACE NADA

(a.obj.fr = 10);

(a); // HAY QUE ARREGLAR LO DE SET PROPERTY
