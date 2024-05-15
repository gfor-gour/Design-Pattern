public class Client {
    public static void main(String[] args) {

        ProxyShell proxyShell_obj = new ProxyShell();
        proxyShell_obj.run("rm -rf", "admin");
        proxyShell_obj.run("mkdir design pattern", "user");
        proxyShell_obj.run("rm -rf", "user");
        proxyShell_obj.run("ex run", "admin");
        proxyShell_obj.run("rm -rf", "admin");
        
    }
}
