def fun():
    import requests
    from pprint import pprint
    from tkinter import *
    s=open("C:/Users/St.Oskol/Desktop/Вывод.txt","w")
    def vivod():
        username = txt.get()
        url = f"https://api.github.com/users/{username}"
        user_data = requests.get(url).json()
        s.write(("company: ")+str(user_data.get("company")))
        s.write(("\ncreated_at: ")+str(user_data.get("created_at")))
        s.write(("\nemail: ")+str(user_data.get("email")))
        s.write(("\nid: ")+str(user_data.get("id")))
        s.write(("\nname: ")+str(user_data.get("name")))
        s.write(("\nurl: ")+str(user_data.get("url")))
        s.close()
        pprint(user_data)
    window = Tk()
    window.geometry('400x250')
    window.title("Практическая работа №11, Сериков Д.Р.")
    txt = Entry(window,width=10)
    txt.grid(column=1, row=0)
    btn = Button(window, text="Вывод", command=vivod)
    btn.grid(column=2, row=0)
    window.mainloop()
fun()
