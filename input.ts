class Person{
    year: number;

    get age() {
        return new Date().getFullYear() - this.year;
    }
}