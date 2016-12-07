package com.innodroid.nqs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.service.quicksettings.TileService;

/**
 * Created by grennis on 12/6/16.
 */

public class NavigationTileService extends TileService {
    @Override
    public void onClick() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=Home"));
        startActivityAndCollapse(intent);
    }
}
