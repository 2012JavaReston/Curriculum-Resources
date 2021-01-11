/**
 *
 * What is TypeScript?
 *  Typescript was developed for larger application. The syntax is closer to Java and C#
 *
 * TS is strongly typed, easier to debug, even get synatx errors.
 *
 * We can install typescrip from NPM using:
 *      npm install -g typescript
 *
 * We can transpile TS into JS using:
 *
 * tsc *filename*.ts
 *
 * tsc *filenamet*.ts -w <-- watch mode
 *
 * tsc -t es2015 *filename*.ts
 *
 * Why transpile than compile?
 *  Trnaspiling is where a language is converted to another similar level of abstraction language.
 *
 */
console.log("HEllo TS!");
/**
 * What are the datatypes in Javascript?
 *      string, number, undefined, null, boolean, symbol, bigInt, object, function
 */
let s1;
s1 = "hello"; //implicilty defined to be a string 
s1 = 3;
console.log(s1);
//In TS we can declare types 
let s2; //impliclty declaring it to be "any"
let s3; //s3 is of type number 
let s4;
s3 = 2;
// s3 = "apples";
s4 = 2;
s4 = "apples";
s4 = true;
console.log(s3);
let v1 = null;
let v2 = null;
let v3 = undefined;
let v4 = null;
//Arrays 
let arr1;
arr1 = [1, 2, 3, 4];
arr1 = [1, 2];
// arr1 = [1,"apples"]; //But doe snot like different datatypes in the array, but array is mutable in size. 
let arr2;
//Tupels - immutable datatypes
// fixed size and datatypes have to be in a specific order
let tupl1;
tupl1 = ['hola', true, 3];
//Enum 
// A unique type that has a fixed set of values. 
//An enumeration is a collection of constants, representational values. 
//Below is the JS way 
const OFF = 0;
const IDLE = 1;
const ACCEL = 2;
let myCarStatus = ACCEL;
if (myCarStatus == OFF) {
    //executes if the car states is off. 
}
//In TS
var carStates;
(function (carStates) {
    carStates[carStates["OFF"] = 0] = "OFF";
    carStates[carStates["IDLE"] = 1] = "IDLE";
    carStates[carStates["STOPLIGHT"] = 72] = "STOPLIGHT";
    carStates[carStates["ACCEL"] = 2] = "ACCEL";
    carStates[carStates["CRUISING"] = 3] = "CRUISING";
})(carStates || (carStates = {}));
if (myCarStatus == carStates.ACCEL) {
    // car acceleration logic. 
}
//FUNCTIONS
function myFunc(a, b, c) {
    //Basically identical to Javascript code
}
function myOtherFunc(a, b, c) {
    //a bit more TS
}
function finalFunc() {
    //here we're specifying the parameter datatypes and the return types. 
    console.log("I'm invoking against TypeScript!");
    return 'hi';
}
;
let nix = {
    name: "Nix",
};
let earth = {
    name: "The Earth",
    hasRings: false,
    moons: [nix],
    orbit: () => console.log("I'm orbiting!")
};
class Star {
    constructor(name, nickname, size, planets) {
        this.name = name;
        this.nickname = nickname;
        this.size = size;
        this.planets = planets;
    }
    fusion() {
        console.log(`${this.name} getting brighter!`);
    }
}
let Sun = new Star("The Sun", "Bright thingy", 1, 8);
console.log(Sun.name);
console.log(Sun.nickname);
console.log(Sun.fusion);
class NeutronStar extends Star {
    constructor(name, nickname, size, planets) {
        // super();
        super(name, nickname, size, planets);
        this.hasExploded = false;
    }
    fusion() {
        super.fusion(); //invoking our parent's functionality 
        this.hasExploded = true;
        console.log("explosions in space!");
    }
    spinabout() {
        console.log("spinning a lot");
    }
}
let pulsar = new NeutronStar("Generic Neutron star", "very spinny", 3, 0); //If we don't define a constructor we get give a parent constructor.
pulsar.fusion();
;
;
class Animal {
    //Overloading in Typescript
    //TS does not allow multiple constructores, instead we get optinal parameters. 
    //optional parameters, we don't need to add them to our arguments 
    // optional parameters HAVE to be on the RIGHT of the non-optional parameters. 
    constructor(breed, age, name) {
        //Why do we add access modifiers? 
        //By adding access modifers to our parameters, we are defining the level of access 
        // and associating it as a property of the object. 
        this.breed = breed;
        this.age = age;
        this.name = name;
    }
    get Breed() {
        console.log("I'm accessing a private variable, the breed through a getter method!");
        return this.breed;
    }
    set Breed(breed) {
        this.breed = breed;
    }
}
// let animal: Animal = new Animal();
// let animal2: Animal = new Animal(2);
// let animal3: Animal = new Animal(2, "Bob");
// let animal4: Animal = new Animal("Bob"); //you've got to go from left to right. 
let puppy = new Animal("Golder Retriever", 8, "Bubby");
console.log(puppy.Breed);
puppy.Breed = "German Shepard";
console.log(puppy.Breed);
