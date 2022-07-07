var x = 10;
console.log(x);

//ctrl+alt+n

// ecma script/es6
// let & const

for (let i = 0; i < 5; i++) {
  console.log(i); //0, 1, 2, 3, 4
}
console.log(i); //ReferenceError: i is not defined

for (var i = 0; i < 5; i++) {
  console.log(i); //0...4
}
console.log(i); // 5

const y = 10;
console.log(y);
//y = 100;
//console.log(y); //TypeError: Assignment to constant variable.

//Data types
console.log(typeof 10); //number
console.log(typeof 10.45); // number
console.log(typeof "Hello"); //string
console.log(typeof true); // boolean
console.log(typeof null); //object
console.log();
// NaN

// object - {}, Array - []
const person = {
  name: "Ram",
  age: 30,
  contactNos: [9999911111, 9999922222],
  address: [
    {
      city: "Chennai",
      state: "Tamilnadu",
    },
    {
      city: "Bengaluru",
      state: "Karnataka",
    },
    {
      city: "Hyderabad",
      state: "Telangana",
    },
  ],
};

// Read person object values
console.log(typeof person); //object
console.log(person.name); // Ram
console.log(person["name"]); // Ram
console.log(person.age); // 30
console.log(person.contactNos); // list of contact numbers
console.log(person.contactNos[0]); //9999911111
console.log(person.contactNos[1]); //9999922222
console.log(person.address); //list of addresses
console.log(person.address[0]); //{ city: 'Chennai', state: 'Tamilnadu' }
console.log(person["name"]);

// update person object
person.name = "Sam";
person.age = 31;
console.log(person);

// update existing number
person.contactNos[1] = 9999933333;
console.log(person.contactNos);

// Add new number
person.contactNos.push(9999944444);
person.contactNos.push(9999955555);
console.log(person.contactNos);

// remove last number
person.contactNos.pop();
console.log(person.contactNos);

//remove specific number from array
person.contactNos.splice(1, 1);
console.log(person.contactNos);

// update address
console.log("Before update: ");
console.log(person.address);

person.address[0].city = "Pune";
person.address[0].state = "Maharashtra";

console.log("After update: ");
console.log(person.address);

// Arrays
const colors = ["white", "red", "orange"];
/*
 read one element old array - add in new array
 return new array
*/

// Spread operator(...) - copy one array elements into another array
const newColors = [...colors];
console.log(colors);
console.log(newColors);

const newColors1 = ["pink", "black", ...colors];
const newColors2 = [...colors, "pink", "black"];
const newColors3 = ["yellow", "green", ...colors, "pink", "black"];

console.log(newColors1);
console.log(newColors2);
console.log(newColors3);

// functions, arrow functions, object destructuring, array destructuring, class, map and filter
