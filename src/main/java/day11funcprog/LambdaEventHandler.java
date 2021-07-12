package day11funcprog;

import javax.swing.event.ChangeListener;

public class LambdaEventHandler {

	public static void main(String[] args) {
		// needs to be reimplemented with lambda event handler
		slider.valueProperty().addListener(

				new ChangeListener<Number>() {

					@Override

					public void changed(ObservableValue<? extends Number> ov,

							Number oldValue, Number newValue) {

						System.out.printf("The slider's new value is %s%n", newValue);

					}

				}

		);

	}

}
