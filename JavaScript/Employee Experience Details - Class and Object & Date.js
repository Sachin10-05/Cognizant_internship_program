/************************************************************************************************************************************************************************/
                                                                    /*script.js*/
/***********************************************************************************************************************************************************************/

class Employee
{
  constructor(name, designation, year_of_experience){
    this.name = name;
    this.designation = designation;
    this.year_of_experience = year_of_experience;
  }
}

function displayEmployee(name, designation, year_of_experience)
{
  createEmployee(name, designation, year_of_experience);
  const d = new Date().getFullYear();
  let year = (d - year_of_experience-2);
  
  return name + " is serving the position of " + designation + " since " + year;
}

function createEmployee(name, designation, year_of_experience)
{
  let employee = new Employee(name, designation, year_of_experience);
  if(validateObject(employee)) { return employee; }
}

function validateObject(employee) 
{
  return employee instanceof Employee;
}
