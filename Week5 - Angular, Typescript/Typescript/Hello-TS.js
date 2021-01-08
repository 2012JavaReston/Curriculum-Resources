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
var s1;
s1 = "hello"; //implicilty defined to be a string 
s1 = 3;
console.log(s1);
//In TS we can declare types 
var s2; //impliclty declaring it to be "any"
var s3; //s3 is of type number 
var s4;
s3 = 2;
// s3 = "apples";
s4 = 2;
s4 = "apples";
s4 = true;
console.log(s3);
var v1 = null;
var v2 = null;
var v3 = undefined;
var v4 = null;
//Arrays 
var arr1;
arr1 = [1, 2, 3, 4];
arr1 = [1, 2];
// arr1 = [1,"apples"]; //But doe snot like different datatypes in the array, but array is mutable in size. 
var arr2;
//Tupels - immutable datatypes
// fixed size and datatypes have to be in a specific order
var tupl1;
tupl1 = ['hola', true, 3];
//Enum 
// A unique type that has a fixed set of values. 
//An enumeration is a collection of constants, representational values. 
//Below is the JS way 
var OFF = 0;
var IDLE = 1;
var ACCEL = 2;
var myCarStatus = ACCEL;
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
var nix = {
    name: "Nix"
};
var earth = {
    name: "The Earth",
    hasRings: false,
    moons: [nix],
    orbit: function () { return console.log("I'm orbiting!"); }
};
