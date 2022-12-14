package creational.design.builder_pattern;

import java.math.BigDecimal;
import java.util.List;
/*
 * The builder pattern, as name implies, is an alternative way to construct complex objects.
 * 
 * The builder pattern is a design pattern that allows for the step-by-step creation of 
 * complex objects using the correct sequence of actions. The construction is controlled 
 * by a director object that only needs to know the type of object it is to create.
 * 
 * Also used to create object of immutable class with some required and some optional attributes.
 * 
 * Separate the construction of a complex object from its representation so that the same 
 * construction process can create different representations.
 * 
 * */
public class Fund {

    private final BigDecimal percentage;
    private final String isin;
    private final List<FundGuaranteeAdapter> guarantees;
    private final FundGuaranteeRegistry fundGuaranteeRegistry;
    private final String naturalIncome;
    private final BigDecimal value;
    private final String currencyCode;
    private final boolean isWithProfitFund;
    private final BigDecimal wpEncashmentValue;
    private final BigDecimal guaranteedWpHolding;
    private final boolean isGuaranteeWPFund;

    private Fund(FundBuilder FundBuilder) {
        this.percentage = FundBuilder.percentage;
        this.isin = FundBuilder.isin;
        this.guarantees = FundBuilder.guarantees;
        this.fundGuaranteeRegistry = FundBuilder.fundGuaranteeRegistry;
        this.naturalIncome = FundBuilder.naturalIncome;
        this.value = FundBuilder.value;
        this.currencyCode = FundBuilder.currencyCode;
        this.isWithProfitFund = FundBuilder.isWithProfitFund;
        this.wpEncashmentValue = FundBuilder.wpEncashmentValue;
        this.guaranteedWpHolding = FundBuilder.guaranteedWpHolding;
        this.isGuaranteeWPFund = FundBuilder.isGuaranteeWPFund;
    }

    public String getIsin() {
        return isin;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public List<FundGuaranteeAdapter> getGuarantees() {
        return guarantees;
    }

    public FundGuaranteeRegistry getFundGuaranteeRegistry() {
        return fundGuaranteeRegistry;
    }

    public String getNaturalIncome() {
        return naturalIncome;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public boolean isWithProfitFund() {
        return isWithProfitFund;
    }

    public BigDecimal getWpPayoutValue() {
        return wpEncashmentValue;
    }

    public BigDecimal getGuaranteedWpHolding() {
        return guaranteedWpHolding;
    }

    public BigDecimal getWpEncashmentValue() {
        return wpEncashmentValue;
    }

    public boolean isGuaranteeWPFund() {
        return isGuaranteeWPFund;
    }

   

    @Override
	public String toString() {
		return "Fund [percentage=" + percentage + ", isin=" + isin + ", guarantees=" + guarantees
				+ ", fundGuaranteeRegistry=" + fundGuaranteeRegistry + ", naturalIncome=" + naturalIncome + ", value="
				+ value + ", currencyCode=" + currencyCode + ", isWithProfitFund=" + isWithProfitFund
				+ ", wpEncashmentValue=" + wpEncashmentValue + ", guaranteedWpHolding=" + guaranteedWpHolding
				+ ", isGuaranteeWPFund=" + isGuaranteeWPFund + "]";
	}



	public static class FundBuilder {
        private BigDecimal percentage;
        private String isin;
        private List<FundGuaranteeAdapter> guarantees;
        private FundGuaranteeRegistry fundGuaranteeRegistry;
        private String naturalIncome;
        private BigDecimal value;
        private String currencyCode;
        private boolean isWithProfitFund;
        private BigDecimal wpEncashmentValue;
        private BigDecimal guaranteedWpHolding;
        private boolean isGuaranteeWPFund;

        public FundBuilder(String isin) {
            this.isin = isin;
        }

        public FundBuilder withPercentage(BigDecimal percentage) {
            this.percentage = percentage;
            return this;
        }

        public FundBuilder withGuarantees(List<FundGuaranteeAdapter> guarantees) {
            this.guarantees = guarantees;
            return this;
        }

        public FundBuilder withFundGuaranteeRegistry(FundGuaranteeRegistry fundGuaranteeRegistry) {
            this.fundGuaranteeRegistry = fundGuaranteeRegistry;
            return this;
        }

        public FundBuilder withNaturalIncome(String naturalIncome) {
            this.naturalIncome = naturalIncome;
            return this;
        }

        public FundBuilder withValue(BigDecimal value) {
            this.value = value;
            return this;
        }

        public FundBuilder withCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public FundBuilder setIsWithProfitFund(boolean isWithProfitFund) {
            this.isWithProfitFund = isWithProfitFund;
            return this;
        }

        public FundBuilder withWpEncashmentValue(BigDecimal wpEncashmentValue) {
            this.wpEncashmentValue = wpEncashmentValue;
            return this;
        }

        public FundBuilder withGuaranteedWpHolding(BigDecimal guaranteedWpHolding) {
            this.guaranteedWpHolding = guaranteedWpHolding;
            return this;
        }

        public FundBuilder setIsGuaranteeWPFund(Boolean isGuaranteeWPFund) {
            this.isGuaranteeWPFund = isGuaranteeWPFund;
            return this;
        }

        public Fund build() {
            return new Fund(this);
           
        }

    }

}
