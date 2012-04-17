@org.juzu.Application

@Assets(
        scripts = {
                @Script(src = "js/jquery.js"),
                @Script(src = "js/bootstrap-transition.js"),
                @Script(src = "js/bootstrap-modal.js")
        },
        stylesheets = {
                @Stylesheet(src = "css/bootstrap.css"),
                @Stylesheet(src = "css/bootstrap-responsive.css"),
                @Stylesheet(src = "css/bootstrap-modal-fix.css")
        })
package org.exoplatform.ecms.dokuzu.list;

import org.juzu.plugin.asset.Assets;
import org.juzu.plugin.asset.Script;
import org.juzu.plugin.asset.Stylesheet;
