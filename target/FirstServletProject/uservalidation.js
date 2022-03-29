const user = document.querySelector('#user');
const userError = document.querySelector('.user-error');
user.addEventListener('input', function () {
    let nameRegex = RegExp('^[A-Z]{1}[a-zA-Z]{2,}$');
    if (nameRegex.test(user.value))
        userError.textContent = "";
    else userError.textContent = "Name is Incorrect";
});

const salary = document.querySelector('#salary');
const salaryerror = document.querySelector('.salary-output');
salaryerror.textContent = salary.value;
salary.addEventListener('input', function () {
    salaryerror.textContent = salary.value;
});