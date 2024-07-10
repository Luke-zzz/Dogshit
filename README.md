# Dogshit
Using somethings and....         make dogshit, just everything like dogshit 



## 2024.6.16

Error: from Selenium

```
ProxySchemeUnknown                        Traceback (most recent call last)
Cell In [1], line 13
     10 # opts = Options()
     11 # opts.ignore_local_proxy_environment_variables()
     12 service=Service(r'C:\Users\Admin\Desktop\webdriver\chromedriver\chromedriver.exe')
---> 13 driver = webdriver.Chrome(service=service)
     14 driver.get("https://www.google.com/")
     16 WebDriverWait(driver,5).until(EC.presence_of_element_located((By.NAME, "q")))
```

Solve

```
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.service import Service

opts = Options()
opts.ignore_local_proxy_environment_variables()
service=Service(r'C:\Users\Admin\Desktop\webdriver\chromedriver\chromedriver.exe')
driver = webdriver.Chrome(options=opts,service=service)
driver.get("https://www.google.com/")
```

