package com.sujalchoudhari;

@SuppressWarnings("serial")
class WierdException extends Exception {
	@Override
	public String toString() {
		return super.toString() + " wierd huh!";
	}
}

public class NOTES_21_Exceptions {

	public static void main(String[] args) {
		try {
			badCode();
		} catch (WierdException e) {
			e.printStackTrace();
		} finally {
			// free resources
			// even after a return statement in try/ catch, finally always executes
		}
	}

	public static void badCode() throws WierdException {
		throw new WierdException();
	}

}
