package bridge.view;

import bridge.controller.BridgeGameController;

public class DefaultView implements View {

    private final OutputView outputView;
    private final InputView inputView;
    private final BridgeGameController controller;

    public DefaultView(
            OutputView outputView,
            InputView inputView,
            BridgeGameController controller) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.controller = controller;
    }

    public void render() {
        outputWelcome();
        inputBridgeSize();
        inputMove();
    }

    private void outputWelcome() {
        outputView.printWelcome();
        System.out.println();
    }

    private void inputBridgeSize() {
        outputView.printReadBridgeSize();
        int bridgeSize = inputView.readBridgeSize();
        controller.createBridge(bridgeSize);
    }

    private void inputMove() {
        outputView.printReadMove();
        String move = inputView.readMove();
        controller.moveBridge(move);
    }

}
