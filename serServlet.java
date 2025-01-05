@WebServlet("/register")
public class UserServlet extends HttpServlet {
    @Override
    public void init() {
        System.out.println("UserServlet Initialized");
    }
}
