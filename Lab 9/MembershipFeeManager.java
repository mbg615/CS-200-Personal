package edu.ua.cs.cs200.lab8;

/**
 *
 * Responsible for payment of membership fees.
 *
 * @author Frank
 *
 */
public class MembershipFeeManager {

	/**
	 * Default constructor
	 */
	public MembershipFeeManager() {
	}

	/**
	 * Membership fee payment method
	 *
	 * @param fee
	 *            fee to be paid
	 */
	public void payMembershipFee(int fee) {
		PaymentAdapter myPaymentAdapter = new PaymentAdapter();
		myPaymentAdapter.pay(fee);
	}

}
