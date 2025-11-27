<<<<<<< HEAD
import { useEffect } from "react";
import { useAuthStore } from "./stores/auth.store";
import { userApi } from "./apis/user/user.api";
import { GlobalStyle } from "./styles/global";
import Layout from "./components/layout/Layout";
import AuthRouter from "./pages/auth/AuthRouter";
import MainRouter from "./pages/MainRouter";

export default function App() {
  const { isInitialized, accessToken, user, setUser } = useAuthStore();

  useEffect(() => {
    if (!isInitialized) return;
    if (!accessToken) return;
    if (user) return;

    (async () => {
      if (accessToken && !user) {
        const me = await userApi.me();
        if (me.success && me.data) {
          setUser(me.data);
        }
      }
    })();
  }, [isInitialized, accessToken]);

  if (!isInitialized) {
    return <div>로딩중</div>;
  }
=======
import { useAuthInitQuery } from "@/hooks/auth/useAuthInitQuery";
import LoginPage from "./pages/LoginPage";
import { Link, Route, Routes } from "react-router-dom";
import RegisterPage from "./pages/RegisterPage";
import OAuht2CallbackPage from "./pages/OAuht2CallbackPage";
import { useAuthStore } from "./stores/auth.store";

export default function App() {
  const { isInitialized, accessToken, user } = useAuthStore();

  if (!isInitialized) return <div>Loading...</div>;
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f

  const isLoggedIn = Boolean(accessToken && user);

  return (
    <>
<<<<<<< HEAD
      <GlobalStyle />
      {isLoggedIn ? (
        <Layout>
          <MainRouter />
        </Layout>
      ) : (
        <AuthRouter />
=======
      {isLoggedIn ? (
        <>
          로그인이 된 경우
        </>
        // <MainRouter />  // 로그인이 된 경우
      ) : (
        // <AuthRouter />  // 로그인 필요
        <>
          로그인 필요
          <Link to="/login">로그인</Link>
          <Routes>
            <Route path="/login" element={<LoginPage />} />
            <Route path="/register" element={<RegisterPage />} />

            {/* OAuth2 소셜 로그인 콜백 */}
            <Route path="/oauth2/callback" element={<OAuht2CallbackPage />} />
          </Routes>
  
        </>
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
      )}
    </>
  );
}
