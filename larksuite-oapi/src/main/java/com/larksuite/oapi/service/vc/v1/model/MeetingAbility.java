// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.vc.v1.model;
import com.google.gson.annotations.SerializedName;

public class MeetingAbility {
    @SerializedName("use_video")
    private Boolean useVideo;
    @SerializedName("use_audio")
    private Boolean useAudio;
    @SerializedName("use_share_screen")
    private Boolean useShareScreen;
    @SerializedName("use_follow_screen")
    private Boolean useFollowScreen;
    @SerializedName("use_recording")
    private Boolean useRecording;
    @SerializedName("use_pstn")
    private Boolean usePstn;

    public Boolean getUseVideo() {
        return this.useVideo;
    }

    public void setUseVideo(Boolean useVideo) {
        this.useVideo = useVideo;
    }

    public Boolean getUseAudio() {
        return this.useAudio;
    }

    public void setUseAudio(Boolean useAudio) {
        this.useAudio = useAudio;
    }

    public Boolean getUseShareScreen() {
        return this.useShareScreen;
    }

    public void setUseShareScreen(Boolean useShareScreen) {
        this.useShareScreen = useShareScreen;
    }

    public Boolean getUseFollowScreen() {
        return this.useFollowScreen;
    }

    public void setUseFollowScreen(Boolean useFollowScreen) {
        this.useFollowScreen = useFollowScreen;
    }

    public Boolean getUseRecording() {
        return this.useRecording;
    }

    public void setUseRecording(Boolean useRecording) {
        this.useRecording = useRecording;
    }

    public Boolean getUsePstn() {
        return this.usePstn;
    }

    public void setUsePstn(Boolean usePstn) {
        this.usePstn = usePstn;
    }

}
