package com.safecharge.response;

import java.util.List;

import com.safecharge.model.SubscriptionsList;

/**
 * Copyright (C) 2007-2017 SafeCharge International Group Limited.
 *
 * @author <a mailto:nikolad@safecharge.com>Nikola Dichev</a>
 * @since 6/6/2017
 */
public class GetSubscriptionsListResponse extends SafechargeResponse {

    private List<SubscriptionsList> subscriptionsList;
    private Long totalCount;

    public List<SubscriptionsList> getSubscriptionsList() {
        return subscriptionsList;
    }

    public void setSubscriptionsList(List<SubscriptionsList> subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("GetSubscriptionListResponse{");
        sb.append("subscriptionsList=")
          .append(subscriptionsList);
        sb.append(", totalCount=")
          .append(totalCount);
        sb.append(", ")
          .append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}