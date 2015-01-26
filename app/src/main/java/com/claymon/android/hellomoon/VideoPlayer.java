package com.claymon.android.hellomoon;

import android.context.Context;
import android.media.MediaPlayer;

/**
* Created by Charlie on 1/26/15
*/

public class VideoPlayer{
	private MediaPlayer mPlayer;
	
	public void stop(){
		if(mPlayer != null){
			mPlayer.release();
			mPlayer = null;
		}
	}
	
	public void play(Context c){
		mPlayer.create(c, R.raw.apollo_17_stroll);
		
		mPlayer.setOnCompletionListener(new MediaPlayer.onCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				stop();
			}
		});
		
		mPlayer.start();
	}
	
}