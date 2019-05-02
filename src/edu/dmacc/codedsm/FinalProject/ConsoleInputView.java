package edu.dmacc.codedsm.FinalProject;

public class ConsoleInputView implements InputView {
    private Payroll payroll;

    public ConsoleInputView(Payroll payroll) {
        this.payroll = payroll;
    }

    @Override
    public void render() {
        {
            System.out.println("Payroll List = "+ payroll.getEmployee());
        }

    }
}
