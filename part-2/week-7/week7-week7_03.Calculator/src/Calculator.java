public class Calculator {

    private Reader reader;
    private int succesfulOperationCount;

    public Calculator() {
        reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                succesfulOperationCount++;
            } else if (command.equals("difference")) {
                difference();
                succesfulOperationCount++;
            } else if (command.equals("product")) {
                product();
                succesfulOperationCount++;
            }
        }

        statistics();
    }

    private void sum() {
        int[] inputArgs = readInputArgs();
        int sum = inputArgs[0] + inputArgs[1];
        System.out.println("sum of the values " + sum);
    }

    private void difference() {
        int[] inputArgs = readInputArgs();
        int difference = inputArgs[0] - inputArgs[1];
        System.out.println("difference of the values " + difference);
    }

    private void product() {
        int[] inputArgs = readInputArgs();
        int product = inputArgs[0] * inputArgs[1];
        System.out.println("product of the values " + product);
    }

    private void statistics() {
        System.out.println("Calculations done " + succesfulOperationCount);
    }

    private int[] readInputArgs() {
        int[] inputsArgs = new int[2];
        System.out.print("value1: ");
        inputsArgs[0] = reader.readInteger();
        System.out.print("value2: ");
        inputsArgs[1] = reader.readInteger();
        return inputsArgs;
    }

}
