// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;
import com.google.gson.annotations.SerializedName;

public class MeetingInviteResult {
    @SerializedName("invite_results")
    private MeetingInviteStatus[] inviteResults;

    public MeetingInviteStatus[] getInviteResults() {
        return this.inviteResults;
    }

    public void setInviteResults(MeetingInviteStatus[] inviteResults) {
        this.inviteResults = inviteResults;
    }

}
