package io.github.erictowns.entity;

import java.util.List;

/**
 * desc:
 *
 * @author EricTownsChina@outlook.com
 * @date 2024-07-13 23:12
 */
public class Combination extends Criteria {

    @Override
    protected boolean express() {
        return false;
    }

    private String relation;

    private List<Expression> expressionList;



    public String getRelation() {
        return relation;
    }

    public Combination setRelation(String relation) {
        this.relation = relation;
        return this;
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public Combination setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
        return this;
    }


}
