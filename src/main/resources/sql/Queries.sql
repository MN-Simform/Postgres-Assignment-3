SELECT * FROM department

SELECT * FROM employee

TRUNCATE TABLE department RESTART IDENTITY

TRUNCATE TABLE employee RESTART IDENTITY



CREATE OR REPLACE VIEW v_emp_dept AS 
SELECT e.emp_id, e.emp_name, e.emp_sal, d.dept_name
FROM employee e
INNER JOIN department d ON e.dept_id = d.dept_id;

SELECT * FROM v_emp_dept;