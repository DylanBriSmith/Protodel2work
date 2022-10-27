package client;

import commandPackage.Command;
import resultPackage.Result;

public class ClientUnit {
    private static ClientUnit instance = null;
    private static Command ClientUnitCommand;

    public ClientUnit() {
    }

    private ClientUnit ClientUnit() {
        return this.ClientUnit();
    }

    public static ClientUnit getInstance() {
        if (instance == null) {
            instance = new ClientUnit();
        }

        return instance;
    }

    public Result execute() {
        Result aResult = ClientUnitCommand.doAction();
        System.out.println(aResult.getResultData());
        return aResult;
    }

    public Command getClientUnitCommand() {
        return ClientUnitCommand;
    }

    public static void setClientUnitCommand(Command aClientUnitCommand) {
        ClientUnitCommand = aClientUnitCommand;
    }
}
