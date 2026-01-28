package tech.codoverse.model.entities;

import java.math.BigDecimal;
import java.time.YearMonth;

public class Budget extends BaseEntity {

    private Category category;
    private BigDecimal limitAmount;
    private YearMonth month;

    public Budget(Category category, BigDecimal limitAmount, YearMonth month) {
        this.category = category;
        this.limitAmount = limitAmount;
        this.month = month;
    }

    public Category getCategory() {
        return category;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public YearMonth getMonth() {
        return month;
    }

}
