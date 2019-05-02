package edu.dmacc.codedsm.FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PayrollControllerImpl implements PayrollController {
    @Override
    public InputView process(Map<Integer, String> employeeList) {
        List<Employee> employee = new ArrayList<>();

            for (Integer key : employeeList.keySet()) {

                employee.add(new Employee(key,employeeList.get(key).split(",")[0],0.0,Double.parseDouble(employeeList.get(key).split(",")[1])));

            }

        Payroll payroll = new Payroll();
        payroll.setEmployee(employee);
        return new ConsoleInputView(payroll);
    }
}
