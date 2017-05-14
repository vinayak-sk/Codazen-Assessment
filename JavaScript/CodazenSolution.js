//Class Student
class Student {
  constructor(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  getStudentString() {
    return this.firstName + this.lastName + this.age;
  }
}

//Finding out the matching students count in 2 classes
function differenceInClasses(classA, classB) {
  var diff = [];
  classA.forEach(function(e) {
    if (classB.indexOf(e) === -1) {
      diff.push(e);
    }
  });
  //count for class with high count of students, subtrated by diff i.e. non repeting students
  return (classA.length - diff.length);
}


//creating instances of 3 new students
var A = new Student("George","Washington", 23);
var B = new Student("John","Adams", 25);
var C = new Student("Thomas","Jefferson", 27);

//creating 4 different classes
var class1 = [A,B];
var class2 = [A,C];
var class3 = [A,B,C];
var class4 = [C];

//output variable for difference
var result = 0;

//picking any 2 classes out of the 4
var tempClass1 = class1;
var tempClass2 = class2;

//Comparing Students in class1 and class2
if(tempClass1.length >= tempClass2.length){
	result = differenceInClasses(tempClass1,tempClass2);
}
else{
	result = differenceInClasses(tempClass2,tempClass1);
}

//Final Output for comparing students in the two classes
console.log(result);
