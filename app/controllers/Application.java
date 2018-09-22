/**
 * Copyright 2012-214 Jorge Aliss (jaliss at gmail dot com) - twitter: @jaliss
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package controllers;

import com.google.inject.Inject;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import securesocial.core.RuntimeEnvironment;
import securesocial.core.java.SecureSocial;
import securesocial.core.java.SecuredAction;
import service.DemoUser;
import views.html.index;

/**
 * A sample controller
 */
public class Application extends Controller {
    public static Logger.ALogger logger = Logger.of("application.controllers.Application");
    private RuntimeEnvironment env;

    /**
     * A constructor needed to get a hold of the environment instance.
     * This could be injected using a DI framework instead too.
     *
     * @param env
     */
    @Inject()
    public Application (RuntimeEnvironment env) {
        this.env = env;
    }
    /**
     * This action only gets called if the user is logged in.
     *
     * @return
     */

    @SecuredAction
    public Result index() {
        if(logger.isDebugEnabled()){
            logger.debug("access granted to index");
        }
        DemoUser user = (DemoUser) ctx().args.get(SecureSocial.USER_KEY);
        return ok(index.render(user, SecureSocial.env()));
    }

}
