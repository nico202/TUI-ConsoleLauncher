package ohi.andre.consolelauncher.commands.raw;

/*Copyright Francesco Andreuzzi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

import android.content.Intent;
import android.net.Uri;

import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecInfo;

public class donate implements CommandAbstraction {

    private final String DONATE_URL = "https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=6PBTQ6L5F3WU6";

    @Override
    public String exec(ExecInfo info) throws Exception {
        Intent donateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(DONATE_URL));
        info.context.startActivity(donateIntent);
        return info.res.getString(R.string.output_rate);
    }

    @Override
    public int minArgs() {
        return 0;
    }

    @Override
    public int maxArgs() {
        return 0;
    }

    @Override
    public int[] argType() {
        return null;
    }

    @Override
    public int priority() {
        return 3;
    }

    @Override
    public int helpRes() {
        return R.string.help_donate;
    }

    @Override
    public int notFoundRes() {
        return 0;
    }

    @Override
    public String onNotArgEnough(ExecInfo info, int nArgs) {
        return null;
    }

    @Override
    public String[] parameters() {
        return null;
    }
}
