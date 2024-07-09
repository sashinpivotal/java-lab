package _23_streams.streams_refactored_example2;

public class Transaction {
	
	private Integer id;
	private TransactionType transactionType;
	private Integer value;
	
	public Transaction(Integer id, TransactionType transactionType, Integer value) {
		this.id = id;
		this.transactionType = transactionType;
		this.value = value;
	}

	public Integer getValue() {
		return this.value;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	TransactionType getTransactionType() {
		return transactionType;
	}

	void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

}
