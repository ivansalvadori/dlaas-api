package br.ufsc.inf.lapesd.diaas.api.endpoint;

import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class WebGuiEndpoint {

    @GET
    @Produces(MediaType.TEXT_HTML + ";qs=1")
    public Response entrypoint() {
        InputStream in = this.getClass().getResourceAsStream("/webgui/index.html");
        return Response.ok(in).build();
    }

    @GET
    @Path("index.js")
    @SuppressWarnings("resource")
    public Response newRequestJs() {
        InputStream in = this.getClass().getResourceAsStream("/webgui/index.js");
        return Response.ok(in).build();
    }

    @GET
    @Path("/diaas-logo.gif")
    @SuppressWarnings("resource")
    public Response sddmsLogoJpg() {
        InputStream in = this.getClass().getResourceAsStream("/webgui/img/diaas-logo.gif");
        return Response.ok(in).build();
    }

    @GET
    @Path("loading.gif")
    @SuppressWarnings("resource")
    public Response loadingGif() {
        InputStream in = this.getClass().getResourceAsStream("/webgui/loading.gif");
        return Response.ok(in).build();
    }

    @GET
    @Path("jquery.js")
    @SuppressWarnings("resource")
    public Response jqueryJs() {
        InputStream in = this.getClass().getResourceAsStream("/webgui/jquery/jquery-2.1.4.min.js");
        return Response.ok(in).build();
    }

    @GET
    @Path("bootstrap.js")
    @SuppressWarnings("resource")
    public Response bootstrapJs() {
        InputStream in = this.getClass().getResourceAsStream("/webgui/bootstrap/js/bootstrap.min.js");
        return Response.ok(in).build();
    }

    @GET
    @Path("bootstrap.css")
    @SuppressWarnings("resource")
    @Produces("text/css")
    public Response bootstrapCss() {
        InputStream in = this.getClass().getResourceAsStream("/webgui/bootstrap/css/bootstrap.css");
        return Response.ok(in).build();
    }

    @GET
    @Path("fonts/glyphicons-halflings-regular.ttf")
    @SuppressWarnings("resource")
    @Produces("application/x-font-truetype")
    public Response ttf() {
        InputStream in = this.getClass().getResourceAsStream("/sddms-web/bootstrap/css/fonts/glyphicons-halflings-regular.ttf");
        return Response.ok(in).build();
    }

    @GET
    @Path("fonts/glyphicons-halflings-regular.woff")
    @SuppressWarnings("resource")
    @Produces("application/font-woff")
    public Response woff() {
        InputStream in = this.getClass().getResourceAsStream("/sddms-web/bootstrap/css/fonts/glyphicons-halflings-regular.woff");
        return Response.ok(in).build();
    }

    @GET
    @Path("fonts/glyphicons-halflings-regular.woff2")
    @SuppressWarnings("resource")
    @Produces("application/font-woff")
    public Response woff2() {
        InputStream in = this.getClass().getResourceAsStream("/sddms-web/bootstrap/css/fonts/glyphicons-halflings-regular.woff2");
        return Response.ok(in).build();
    }

    @GET
    @Path("fonts/glyphicons-halflings-regular.svg")
    @SuppressWarnings("resource")
    @Produces("application/font-woff")
    public Response svg() {
        InputStream in = this.getClass().getResourceAsStream("/sddms-web/bootstrap/css/fonts/glyphicons-halflings-regular.svg");
        return Response.ok(in).build();
    }

    @GET
    @Path("fonts/glyphicons-halflings-regular.eot")
    @SuppressWarnings("resource")
    @Produces("application/font-woff")
    public Response eot() {
        InputStream in = this.getClass().getResourceAsStream("/sddms-web/bootstrap/css/fonts/glyphicons-halflings-regular.eot");
        return Response.ok(in).build();
    }

}