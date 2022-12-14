package creational.design.builder_pattern;

import java.math.BigDecimal;

public class TestBuilder {

	
	public static void main(String[] args){
		Fund fund = new Fund.FundBuilder("ISIN").
				withCurrencyCode("GBP")
				.withValue(new BigDecimal(123))
				.setIsGuaranteeWPFund(true).build();
		
		System.out.println(fund);
	}
}
