package com.volokh.danylo.videolist.player;

import com.volokh.danylo.videolist.adapter.interfaces.VideoPlayerManagerCallback;
import com.volokh.danylo.videolist.ui.VideoPlayer;

public class Start extends PlayerMessage{

    private final String mVideoUrl; // TODO: remove

    public Start(VideoPlayer videoPlayer, String videoUrl, VideoPlayerManagerCallback callback) {
        super(videoPlayer, callback);
        mVideoUrl = videoUrl;
    }

    @Override
    protected void performAction(VideoPlayer currentPlayer) {
        currentPlayer.start();
    }

    @Override
    protected PlayerMessageState stateBefore() {
        return PlayerMessageState.STARTING;
    }

    @Override
    protected PlayerMessageState stateAfter() {
        return PlayerMessageState.STARTED;
    }
}
