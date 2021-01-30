package first.ssm.model;

import lombok.Data;

@Data
public class Account {
    private Integer id;
    private String name;
    private Double money;

    public Account(Integer id, String name, Double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }
}

