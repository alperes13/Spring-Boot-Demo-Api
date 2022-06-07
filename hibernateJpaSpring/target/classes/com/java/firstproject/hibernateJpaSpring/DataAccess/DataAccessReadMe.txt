There is data access layer for hibernate

Sessions = Sending a session to database and before to process putting our CRUD operations inside of session.
Actually we are not sending CRUD operations, sending sessions. It is for transactional managing.

Transactional = If we posting 2 session in a same process, and there is a wrong one of session,
another session will be cancel too. So transactional will not work.